<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="03Retrive.aspx.cs" Inherits="disconneted._03Retrive" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
         <div>
            <p>
                <asp:GridView ID="GridView1" runat="server">

                </asp:GridView>
            </p>

            <p>
                <asp:Button runat="server" 
                    Text="Back to Home" 
                    OnClick="Home_Click"></asp:Button>
            </p>
        </div>
    </form>
</body>
</html>
