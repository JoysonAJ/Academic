<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="delete.aspx.cs" Inherits="database2.delete" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
<p>
    <asp:TextBox ID="deleteNumber" runat="server"></asp:TextBox>
    
    <asp:DropDownList ID="studentList" runat="server" 
             AutoPostBack="True" OnSelectedIndexChanged="selected_registerNumber">
            </asp:DropDownList><br />
</p>

            <p>
                <asp:Button ID="deleteClick" runat="server" Text="Delete" OnClick="deleteClick_Click" />
                <asp:Button ID="HomeClick" runat="server" Text="Home" OnClick="HomeClick_Click" />
            </p>
        </div>
    </form>
</body>
</html>
