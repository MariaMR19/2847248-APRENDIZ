<?php

namespace App\Models;


use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class note extends Model
{
    protected $fillable = [

        "documento",
        "nombre",
        "direccion",
        "origen",
        "destino",
        "precio",

    ];
}
