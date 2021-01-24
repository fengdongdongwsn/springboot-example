<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">  <title>${msg}</title>
</head>
<body>
<p>单文件上传</p>
<form action="upload" method="post" enctype="multipart/form-data">
    文件:<input type="file" name="file"/>
    <input type="submit"/>
</form>
<hr/>
<p>文件下载</p>
<form action="batch" method="post" enctype="multipart/form-data">
    <p>文件1:<input type="file" name="file"/></p>
    <p>文件2:<input type="file" name="file"/></p>
    <p><input type="submit" value="上传"/></p>
</form>
</body>
</html>