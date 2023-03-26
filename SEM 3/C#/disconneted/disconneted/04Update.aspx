<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="04Update.aspx.cs" Inherits="disconneted._04Update" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Update</title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <p>
                <asp:Label ID="Label1" runat="server" Text="Choose Product"></asp:Label>
                <asp:DropDownList 
                    ID="ddlProduct" AutoPostBack="true" 
                    runat="server"
                    OnSelectedIndexChanged="ddlProduct_selectIndexchanged"></asp:DropDownList>
            </p>

            <p>
                <asp:Label ID="Label2" runat="server" Text="Product Name"></asp:Label>
                <asp:TextBox ID="TextBox1" runat="server" ></asp:TextBox>
            </p>

            <p>
                <asp:Label ID="Label3" runat="server" Text="Price">
                </asp:Label>
                <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
            </p>
            
            <p>
            <asp:Button ID="Button1" runat="server" Text="Update" OnClick="Update_Click" />
            <asp:Button ID="Button2" runat="server" Text="backHome" OnClick="backHome_Click" />
            <asp:Button ID="Button3" runat="server" Text="Display" OnClick="Display_Click" />
            </p>
        </div>
    </form>
</body>
</html>
