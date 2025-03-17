<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

    <form action="{{route('store')}}" method="POST">
        @csrf

        <label>documento</label>
        <input type="text" name="documento">
        @error('documento')
            <p>{{$message}}</p>
        @enderror

        <label>nombre</label>
        <input type="text" name="nombre">
        @error('nombre')
        <p>{{$message}}</p>
        @enderror

        <label>direccion</label>
        <input type="text" name="direccion">

        <label>origen</label>
        <input type="text" name="origen">

        <label>destino</label>
        <input type="text" name="destino">


        <label>precio</label>
        <input type="text" name="precio">

        <input type="submit" value="create">
    </form>
</body>
</html>
