<?php

use App\Books;
use Faker\Factory;
use Illuminate\Database\Seeder;

class BookSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        //
        Books::truncate();

        $faker = Factory::create();

        for ($i=0; $i < 10; $i++) {
            # code...
            Books::create([
                'cover' => $faker->image($dir = 'public/images', $width = 640, $height = 480, 'people'),
                'name' => $faker->realText($maxNbChars = 25, $indexSize = 2),
                'author' => $faker->name,
                'release_year' => $faker->year,
                'isbn' => $faker->isbn13
            ]);
        }
    }
}
