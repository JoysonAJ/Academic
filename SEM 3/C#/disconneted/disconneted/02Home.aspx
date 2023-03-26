<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="02Home.aspx.cs" Inherits="disconneted._02Home" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <p>
                <asp:Button runat="server" Text="Insert" OnClick="Insert_Click"></asp:Button>
                <asp:Button runat="server" Text="Delete" OnClick="Delete_Click"></asp:Button>
                <asp:Button runat="server" Text="Retrive" OnClick="Retrive_Click"></asp:Button>
                <asp:Button runat="server" Text="Update" OnClick="Update_Click"></asp:Button>
            </p>
        </div>
    </form>
</body>
</html>
