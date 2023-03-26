<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="RetrivePage.aspx.cs" Inherits="WebApplication1.RetrivePage" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:GridView ID="GridView1" runat="server">
            </asp:GridView>

            <p>
                <asp:Button ID="HomeClick" runat="server" Text="HOME" OnClick="HomeClick_Click" />
            </p>
        </div>
    </form>
</body>
</html>
