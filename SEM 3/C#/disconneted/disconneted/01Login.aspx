<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="01Login.aspx.cs" Inherits="disconneted._01Login" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
         <div>
            <p>
                 <asp:Label ID="Lable2" runat="server" Text="Username">
                 </asp:Label>
                <asp:TextBox runat="server" ID="TextBoxUserName">
                </asp:TextBox>
            </p>

            <p>
                <asp:Label ID="Label1" runat="server" Text="Password"></asp:Label>
                <asp:TextBox ID="TextBoxPassword" runat="server"></asp:TextBox>
            </p>

           <p>
               <asp:Button ID="Button1" runat="server" Text="Login " OnClick="Button1_Click" />
           </p>
        </div>
    </form>
</body>
</html>
