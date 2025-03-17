<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class noterequest extends FormRequest
{
    /**
     * Determine if the user is authorized to make this request.
     */
    public function authorize(): bool
    {
        return true;
    }

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array<string, \Illuminate\Contracts\Validation\ValidationRule|array<mixed>|string>
     */
    public function rules(): array
    {
        return [
            "documento" => "required|max:255|min:3",
            "nombre" => "required|max:255|min:3",
        ];
    }


    public function messages():array
    {
        return [
            "documento.required" => "este campo es obligatorio",
            "nombre.required" => "este campo es obligatorio",
        ];
    }
}
