<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Home.aspx.cs" Inherits="WebApplication1.Home" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    
    <form id="form1" runat="server">
        <div>
            <p>
                <asp:Button runat="server" Text="Insert" OnClick="Unnamed1_Click"></asp:Button>
                <asp:Button runat="server" Text="Delete" OnClick="Unnamed2_Click"></asp:Button>
                <asp:Button runat="server" Text="Retrive" OnClick="Unnamed3_Click"></asp:Button>
                <asp:Button runat="server" Text="Update" OnClick="Unnamed4_Click"></asp:Button>
            </p>
        </div>
    </form>
</body>
</html>
