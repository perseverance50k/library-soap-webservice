<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text"/>
    <xsl:template match="Library">
        <paragraph>
            <b>Library: <xsl:value-of select="Library_Name" /></b>
        </paragraph>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        Books:
        <xsl:for-each select="Books/Library_Book">
            ============================
            <b>Book ID: <xsl:value-of select="Book_ID"/></b><xsl:text>&#xa;</xsl:text>
            <b>Author ID: <xsl:value-of select="Book_Author_ID"/></b><xsl:text>&#xa;</xsl:text>
            <b>Title: <xsl:value-of select="Book_Title"/></b><xsl:text>&#xa;</xsl:text>
            <b>Edition: <xsl:value-of select="Book_Edition"/></b><xsl:text>&#xa;</xsl:text>
            <b>Release date: <xsl:value-of select="Book_Release_Date"/></b>
            ============================
        </xsl:for-each>

        Loans:
        <xsl:for-each select="Loans/Library_Loan">
            ============================
            <b>Loan ID: <xsl:value-of select="Loan_ID"/></b><xsl:text>&#xa;</xsl:text>
            <b>Student ID: <xsl:value-of select="Loan_Student_ID"/></b><xsl:text>&#xa;</xsl:text>
            <b>Book ID: <xsl:value-of select="Loan_Book_ID"/></b><xsl:text>&#xa;</xsl:text>
            <b>From: <xsl:value-of select="Loan_From"/></b><xsl:text>&#xa;</xsl:text>
            <b>To: <xsl:value-of select="Loan_To"/></b>
            ============================
        </xsl:for-each>

    </xsl:template>
</xsl:stylesheet>