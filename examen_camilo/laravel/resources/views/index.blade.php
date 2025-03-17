<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    @if($message = Session::get('success'))
        <div>
            <p>{{$message}}</p>
        </div>
    @endif
    @if($message = Session::get('danger'))
        <div>
            <p>{{$message}}</p>
        </div>
    @endif
</body>
</html>

    <a href="{{route('create')}}">crear un nuevo dato</a>
    <h1>Lista</h1>
    @forelse($notes as $note)

        <li>
            <a href="{{route('edit',$note->id)}}">editar</a>
            <a href="{{route('show',$note->id)}}">{{$note->nombre}}</a>

            <form action="{{route('destroy',$note->id)}}" method="POST">
                @method('delete')
                @csrf

                <input type="submit" value="delete">
            </form>
        </li>
    @empty
        <h1>lista vacia</h1>
    @endforelse
