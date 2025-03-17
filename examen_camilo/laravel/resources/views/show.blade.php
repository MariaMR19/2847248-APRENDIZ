<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <a href="{{route('index')}}">volver</a>
    <h1>{{$note->documento}}</h1>
    <p>{{$note->nombre}}</p>
    <p>{{$note->direccion}}</p>
    <p>{{$note->origen}}</p>
    <p>{{$note->destino}}</p>
    <p>{{$note->precio}}</p>
</body>
</html>
