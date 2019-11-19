<%@ page import="com.icitic.hrms.util.Tools" %>
<%@ page import="java.util.List" %>
<%@ page import="com.icitic.hrms.emp.pojo.bo.PersonBO" %>
<%@ page import="com.icitic.hrms.cache.SysCacheTool" %>
<%@ page import="com.icitic.hrms.util.Endecode" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib uri="struts-html.tld" prefix="html" %>
<%@ taglib uri="struts-bean.tld" prefix="bean" %>
<%@ taglib uri="struts-logic.tld" prefix="logic" %>
<%@ taglib uri="hrms.tld" prefix="hrms" %>
<%
    String isTrue = "";
    List list = (List)request.getAttribute("list");
    if(list!=null){
        isTrue = "isTrue";
    }
    request.setAttribute("dataList",list);
    String pid = "";
%>
<script language="javascript">
    function showProcessBar() {
        x = document.body.clientWidth / 2 - 150;
        y = document.body.clientHeight / 2;
        document.all('processbar').style.top = y;
        document.all('processbar').style.left = x;
        document.all('processbar').style.display = "";
    }
    function forUpload() {
        var form = document.forms[0];
        var value = form.theFile.value;
        if (value == null || value == "") {
            alert("上传文件不能为空");
            return false;
        } else if (value.length < 5 || value.substr(value.length - 4) != '.xls') {
            alert("上传文件必须为.xls文件");
            return false;
        }
        showProcessBar();
        forSubmit(form);
        return true;
    }
    function forExport(item){
        var pid = document.forms[0].pid.value;
        var isTrue = document.forms[0].isTrue.value;
        if(isTrue!=""){
            if("1" == item){

                window.open(basePath + '/person/personDataUpload.do?actPara=exportResumeAll&pid='+pid.base64Encode(), 'newwindow', 'top=0,left=0,toolbar=no,menubar=yes,scrollbars=yes,resizable=yes,location=no,status=yes');
            }
            if("2" == item){
                window.open(basePath + '/person/personDataUpload.do?actPara=exportResumeOne&pid='+pid.base64Encode(), 'newwindow', 'top=0,left=0,toolbar=no,menubar=yes,scrollbars=yes,resizable=yes,location=no,status=yes');
            }
        }else{
            alert("请先上传导出人员信息！");
        }

    }
    function forExp(item) {
        var pid = document.forms[1].pid.value;
        var isTrue = document.forms[1].isTrue.value;
        document.forms[1].action = "<%=request.getContextPath()%>/person/personDataUpload.do";
        document.forms[1].method = "post";
        if(isTrue!=""){
            if("1" == item){
                document.forms[1].actPara.value = "exportResumeAll";
                document.forms[1].submit();
            }
            if("2" == item){
                document.forms[1].actPara.value = "exportResumeOne";
                document.forms[1].submit();
            }
        }else{
            alert("请先上传导出人员信息！");
        }
    }
</script>
<center>
    <table width="100%" border="0" cellpadding="0" cellspacing="0">
        <tr>
            <td class="page_title">&nbsp;&nbsp;批量导出简历</td>
        </tr>
    </table>
    <html:form action="/jsbank/zp/hireApply.do" method="post" enctype="multipart/form-data">
        <input type="hidden" name="actPara" value="backCheck1">
        <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    <html:errors/>
                </td>
            </tr>
        </table>
        <br>
        <table align="left" class="td_title">
            人员名单导入
        </table>
        <br><br>
        <table width=90% border="0" cellspacing="1" cellpadding="3" align=center class="table">
            <tr>
                <td class="td_lable" colspan="2">选择要上传的excel文件</td>
                <td class="td_edit" colspan="0">
                    <html:file styleClass="input" size="40"  property="theFile" />
                    <input name="Button" type="button" class="button" value=" 上传 " onclick="forUpload()">

                </td>
                <td class="td_edit" >
                    <input type="button" id="wanzheng" name="wanzheng" class="button" value="完整版导出" onclick="forExp('1')" />
                    <input type="button" id="jianyi" name="jianyi" class="button" value="简易版导出" onclick="forExp('2')" />
                </td>
            </tr>
        </table>
        <br><br>
        <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    <font style="color: #ff0000" size="2">导入格式说明：excel文件只能包含两列且顺序为，姓名和工号。</font>

                </td>
            </tr>
        </table>
        <br>
        <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
            <tr>
                <td class="td_header">编号</td>
                <td class="td_header">姓名</td>
                <td class="td_header">工号</td>
                <td class="td_header">身份证号</td>
                <td class="td_header">性别</td>
                <td class="td_header">单位</td>
                <td class="td_header">一级部门</td>
                <td class="td_header">二级部门</td>
                <td class="td_header">岗位</td>
            </tr>
            <%
                if(list != null){
                    for(int i = 0;i<list.size();i++){
                        Map map = (Map) list.get(i);
                        //pid += b.getPersonId() + ",";
            %>
            <tr align="center">
                <td class="td_body"><%=i+1%></td>
                <td class="td_body"><%=Tools.filterNull(map.get("A001001"))%></td>
                <td class="td_body"><%=Tools.filterNull(map.get("A001735"))%></td>
                <td class="td_body"><%=Tools.filterNull(map.get("A001077"))%></td>
                <td class="td_body"><%=Tools.filterNull(SysCacheTool.interpretCode((String) map.get("A001007")))%></td>
                <td class="td_body"><%=Tools.filterNull(SysCacheTool.interpretOrg((String) map.get("A001701")))%></td>
                <td class="td_body"><%=Tools.filterNull(SysCacheTool.interpretOrg((String) map.get("A001700")))%></td>
                <td class="td_body"><%=Tools.filterNull(SysCacheTool.interpretOrg((String) map.get("A001705")))%></td>
                <td class="td_body"><%=Tools.filterNull(SysCacheTool.interpretCode((String) map.get("A001715")))%></td>
            </tr>
            <%
                    }
                    //pid = pid.substring(0,pid.length()-1);
                }
            %>
        </table>
    </html:form>
</center>
<marquee id="processbar" style="position:absolute;display:none;border:1px solid #000000" direction="right" width="300"
         scrollamount="5" scrolldelay="10"
         bgcolor="#ECF2FF">
    <table cellspacing="1" cellpadding="0">
        <tr height=8>
            <td bgcolor=#3399FF width=8></td>
            <td></td>
            <td bgcolor=#3399FF width=8></td>
            <td></td>
            <td bgcolor=#3399FF width=8></td>
            <td></td>
            <td bgcolor=#3399FF width=8></td>
            <td></td>
        </tr>
    </table>
</marquee>
<form action="" name="form2" target="_blank">
    <input type="hidden" name="pid" id="pid" value="<%=pid%>">
    <input type="hidden" name="actPara" value="importData">
    <input type="hidden" name="isTrue" value="<%=isTrue%>">
    <input type="hidden" name="xlsFlag" value="xls">
    <table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>

        </tr>
    </table>
</form>
<script type="text/javascript">
    interpret(document.forms[0]);
</script>