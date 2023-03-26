<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="delete.aspx.cs" Inherits="WebApplication1.delete" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <p>
                <asp:Label ID="Label1" runat="server" Text="Choose Product"></asp:Label>
                <asp:DropDownList ID="ddlProduct" runat="server"></asp:DropDownList>
            </p>

            <p>
                <asp:Label ID="Label2" runat="server" Text="Product Name :"></asp:Label>
                <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            </p>

            <p>
                <asp:Label ID="Label3" runat="server" Text="Price"></asp:Label>
                <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
            </p>

            <p>
                <asp:Button ID="Button1" runat="server" Text="Delete" OnClick="Button1_Click" />
                <asp:Button ID="Button2" runat="server" Text="Home" OnClick="Button2_Click" />
                <asp:Button ID="Button3" runat="server" Text="Display" OnClick="Button3_Click" /> 

            </p>
        </div>
    </form>
</body>
</html>
