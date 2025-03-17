<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\notecontroller;
use App\Http\Requests\noterequest;



/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/


// Route::get('/', function () {
//     return view('welcome');
// });



route::get('/index',[notecontroller::class,'index'])->name('index');
route::get('/create',[notecontroller::class,'create'])->name('create');
route::post('/store',[notecontroller::class,'store'])->name('store');



route::get('/edit{note}',[notecontroller::class,'edit'])->name('edit');



route::get('/show{note}',[notecontroller::class,'show'])->name('show');
route::put('/update{note}',[notecontroller::class,'update'])->name('update');
route::delete('/destroy{note}',[notecontroller::class,'destroy'])->name('destroy');
