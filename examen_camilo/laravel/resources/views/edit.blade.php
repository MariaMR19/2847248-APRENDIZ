<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <a href="{{route("index")}}">volver</a>

    <form action="{{route('update', $note->id)}}" method="POST">
        @method('put')
        @csrf

        <label>documento</label>
        <input type="text" name="documento" value="{{$note->documento}}">

        <label>nombre</label>
        <input type="text" name="nombre" value="{{$note->nombre}}">

        <label>direccion</label>
        <input type="text" name="direccion" value="{{$note->direccion}}">

        <label>origen</label>
        <input type="text" name="origen" value="{{$note->origen}}">

        <label>destino</label>
        <input type="text" name="destino" value="{{$note->destino}}">


        <label>precio</label>
        <input type="text" name="precio" value="{{$note->precio}}">

        <input type="submit" value="update">

    </form>
</body>
</html>
