<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="HomePage.aspx.cs" Inherits="WebApplication1.HomePage" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Button ID="insertClick" runat="server" Text="Insert" OnClick="insertClick_Click" />
            &nbsp
            <asp:Button ID="retriveClick" runat="server" Text="Retrive" OnClick="retriveClick_Click" />
            &nbsp
            <asp:Button ID="updateClick" runat="server" Text="Update" OnClick="updateClick_Click" />
            &nbsp
            <asp:Button ID="deleteClick" runat="server" Text="Delete" OnClick="deleteClick_Click" />
            &nbsp

        </div>
    </form>
</body>
</html>
