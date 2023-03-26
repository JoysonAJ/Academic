<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Insert.aspx.cs" Inherits="WebApplication1.Insert" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>

            <p>
            <asp:Label ID="Result" runat="server" Text=""></asp:Label>
            </p>
            <br />

            <p>
                <asp:Label ID="Label1" runat="server" Text="Register Number"></asp:Label>
               <asp:TextBox ID="regno" runat="server"></asp:TextBox>
            </p>
           <p>
                <asp:Label ID="Labelf2" runat="server" Text="First Name"></asp:Label>
               <asp:TextBox ID="fname" runat="server"></asp:TextBox>
           </p>

            <p>
                <asp:Label ID="Label3" runat="server" Text="Last Name"></asp:Label>
               <asp:TextBox ID="lname" runat="server"></asp:TextBox>
            </p>

             <p>
                 <asp:Button ID="insertClick" runat="server" Text="Insert" OnClick="insertClick_Click" />
                 <asp:Button ID="homeCLick" runat="server" Text="Home" OnClick="homeCLick_Click" />
           
            </p>
        </div>
    </form>
</body>
</html>
