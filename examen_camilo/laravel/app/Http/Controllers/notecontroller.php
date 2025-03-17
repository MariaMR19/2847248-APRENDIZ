<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Requests\noterequest;
use App\Models\note;



class notecontroller extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $notes = note::all();
        return view("index", compact("notes"));
    }

    public function create()
    {
        return view("note");
    }
    public function edit(note $note)
    {
        return view("edit",compact("note"));
    }

    public function store(noterequest $request)
    {
        note::create($request->all());
        return redirect()->route("index")->with("success","dato ingresado");
    }

    public function show(note $note)
    {
        return view("show",compact("note"));
    }

    public function update(noterequest $request, note $note)
    {
        $note->update($request->all());
        return redirect()->route("index")->with("success","dato modificado");
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(note $note)
    {
        $note->delete();
        return redirect()->route("index")->with("danger","dato eliminado");
    }
}
