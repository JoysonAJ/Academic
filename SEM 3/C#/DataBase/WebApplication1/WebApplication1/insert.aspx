<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="insert.aspx.cs" Inherits="WebApplication1.insert" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    
    <form id="form1" runat="server">
        <div>
            <p>
                <asp:Label runat="server" Text="Enter the product name :">
                </asp:Label>
                <asp:TextBox runat="server" ID="text1"></asp:TextBox>

            </p>
            <p>
                <asp:Label runat="server" Text="Enter the price">
                </asp:Label>
                <asp:TextBox ID="tex2" runat="server"></asp:TextBox>
            </p>
            <p>
                <asp:Button ID="Button1" runat="server" Text="Insert" OnClick="Button1_Click" />
                <asp:Button ID="Button2" runat="server" Text="Display" OnClick="Button2_Click" />
                <asp:Button ID="Button3" runat="server" Text="Home" OnClick="Button3_Click" />
            </p>
        </div>
    </form>
</body>
</html>
