﻿<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="update.aspx.cs" Inherits="database2.update" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
         <div>
            <p>
                <asp:Label ID="Label1" runat="server" Text="Enter last name for update"></asp:Label>
                <asp:TextBox ID="lnameUp" runat="server"></asp:TextBox>
            
            </p> 
            <p>
                <asp:DropDownList ID="studentList" runat="server" 
             AutoPostBack="True" OnSelectedIndexChanged="selected_registerNumber">
            </asp:DropDownList><br />
            
            </p>
            
<p>
    <asp:Button ID="upClick" runat="server" Text="Update" OnClick="upClick_Click" />
   <asp:Button ID="HomeClick" runat="server" Text="HOME" OnClick="HomeClick_Click" />

</p>            
        </div>
           
    </form>
</body>
</html>
