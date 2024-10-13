package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Article
import com.example.recyclerview.ArticlesAdapter
import com.example.recyclerview.R
import android.app.Activity;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)

        val adapter = ArticlesAdapter(getArticles(), this)
        recyclerview.adapter=adapter
        val manager=LinearLayoutManager(this)
        recyclerview.layoutManager= manager
    }


    private fun getArticles(): List<Article> {
        val articles = ArrayList<Article>()

        articles.add(Article("GKIDS Partners with Anime Ltd. for Home Entertainment Release of ARCANE", "September 24, 2024", R.drawable.blog1, " NEW YORK (July 9, 2024) – GKIDS, the Academy Award®-winning producer and distributor of artist-driven and award-winning animation, announced partnerships with Anime Ltd. & Plaion Pictures, Plain Archive, Shout! Factory, and Sugoi, to release the first season of ARCANE, the globally beloved hit series from Riot Games, on digital download-to-own and physical home media in international markets in 2024.\n" +
                "\n" +
                "ARCANE will be released on digital download-to-own and physical home entertainment in Europe, South Korea, and Australia/New Zealand by Anime Ltd. & Plaion Pictures, Plain Archive, and Sugoi respectively. It will be released on digital download-to-own platforms in Latin America by Shout! Factory, who will additionally handle physical product distribution for North America alongside GKIDS.\n" +
                "\n" +
                "Earlier this month, out of the Annecy International Film Festival, GKIDS previously announced it had acquired worldwide (excluding China) videogram and digital transactional rights to the first season of the internationally acclaimed series.\n" +
                "\n" +
                "Fans can look forward to a full product array to be announced soon, ranging from digital to premium editions, including a 4K version exclusive to the home entertainment release.\n" +
                "\n" +
                "ARCANE is set in the universe of the massively popular video game League of Legends, made by Riot Games and Fortiche Productions for Netflix. The series is co-created by Christian Linke and Alex Yee, and follows the origins of iconic League champions Vi and Jinx, as they become caught in the power struggle between the utopian city of Piltover and the oppressed underground city of Zaun. \n" +
                "\n" +
                "The series debuted in November 2021 to rave reviews, garnering widespread praise for its striking animation, emotionally complicated characters, thrilling music, and overall production quality. It has been praised by critics as one of the best video game adaptations ever created. The series went on to win four primetime Emmy Awards, including Outstanding Animated Program, as well as nine Annie Awards, including Best Mature Animated Television Broadcast Production."))
        articles.add(Article("First look: Godzilla Minus One on home video", "Date 2, 2024", R.drawable.blog2, "By Andrew Osmond. Many readers of this blog will know what a dating sim is. It’s a computer game where your character develops a romantic relationship with someone else, often one of multiple"))
        articles.add(Article("First look: Re:ZERO Season 2 Collector’s Edition Blu-rays", "Date 3, 2024", R.drawable.blog16, "By Andrew Osmond. Rental Magica begins like a gentler, less assertive, but actually more professional Ghostbusters"))
        articles.add(Article("Tonikawa: Over the Moon for You", "Date 4, 2024", R.drawable.blog4, "Ever since we announced our acquisition of NARUTO – and our plans to bring it to the UK on Blu-ray for the very first time – we’ve had many of you asking for more details of what to expect and when. "))
        articles.add(Article("DAN DA DAN: First Encounter in UK cinemas", "Date 5, 2024", R.drawable.blog5, "By Andrew Osmond. A spy, an assassin and a telepathic tot walk into a story. That’s the set-up for Spy x Family, but it’s pretty much the show’s punchline, too, repeated over and again."))
        articles.add(Article("A Place Further Than the Universe", "Date 6, 2024", R.drawable.blog6, " By Jonathan Clements. Lina is rushed to the infirmary at the edge of life, her body terribly battered and sliced by an encounter with a lethal dragon, surrounded by wizards chanting healing spells and administering stasis commands."))
        articles.add(Article("Trapped in a Dating Sim", "Date 7, 2024", R.drawable.blog7, " By Andrew Osmond. Somali and the Forest Spirit is mostly soft and enchanting, the story of a little girl’s journey through a wondrous world, under the protection of her indefatigable non-human dad."))
        articles.add(Article("Books: Marriage, Divorce and Beyond", "Date 8, 2024", R.drawable.blog9, "By Jonathan Clements. Unsure of what direction to take in life, high-school graduate Hiwa Natsunagi (Haruka Fukuhara) decides to become a professional hula dancer, like her late sister Mari."))
        articles.add(Article("Mutsumi Inomata (1960-2024)", "Date 10, 2024", R.drawable.blog10, "By Andrew Osmond. The film Blue Giant opens in UK cinemas this Wednesday. It’s a music drama about the fortunes of three teen boys in Tokyo – sax player prodigy Dai, haughty pianist Yukinori, and greenhorn drummer Tamada – trying to make it as a jazz trio"))
        articles.add(Article("Lupin III.6", "Date 11, 2024", R.drawable.blog11, "By Helen McCarthy. None of us believed that the ostentatiously non-marketed event known as “the last Hayao Miyazaki film” was actually the last Hayao Miyazaki film, and we were right."))
        articles.add(Article("Golden Time", "Date 12, 2024", R.drawable.blog12, "By Andrew Osmond. Parasyte starts with its money shot. A husband and wife face each other in a dimmed room; then the man’s head splits and unfolds into a Venus fly-trap, with rows of teeth and a half-dozen eyes on stalks."))
        articles.add(Article("SPY x FAMILY CODE: White – Coming to UK cinemas this April!", "Date 13, 2024", R.drawable.blog13, "By Shelley Pallis. Alpi is a wandering exorcist (or “Soul Sender”), although she is not very good at it."))
        articles.add(Article("Science Fell in Love, So I Tried to Prove it", "Date 14, 2024", R.drawable.blog14, "By Andrew Osmond. Great Pretender is a crime-caper series, not unlike Lupin III, but less cartoon-zany."))
        articles.add(Article("Hula Fulla Dance", "Date 15, 2024", R.drawable.blog15, "By Shelley Pallis. After a millennium of warfare, the rival kingdoms of Alhamit and Balkari have finally fought each other to a standstill."))
        articles.add(Article("Ascendance of a Bookworm", "Date 16, 2024", R.drawable.blog3, "By Zoe Crombie. Since its initial release in 2013, Jonathan Clements’ Anime: A History has served as a unique resource for anyone looking to contextualise their love of anime."))
        articles.add(Article("Blue Giant: Yuzuru Tachikawa Interview", "Date 17, 2024", R.drawable.blog17, "\n" +
                "\n" +
                "By Andrew Osmond. Warner Brothers’ acquaintance with anime has twin foundations: a yellow rodent and a red pill."))
        articles.add(Article("Lonely Castle in the Mirror", "Date 18, 2024", R.drawable.blog18, "By Andrew Osmond. Vampire in the Garden is a girl-meets-girl story, set in a wintry wonderland. "))
        articles.add(Article("Books: Ghibli and Grief", "Date 19, 2024", R.drawable.blog19, "Anime Ltd. to announce details for these groundbreaking UK acquisitions early 2024 LONDON, UNITED KINGDOM, 28 OCTOBER 2023 –  Anime Ltd."))
        articles.add(Article("Manga: Alpi the Soul Sender", "Date 20, 2024", R.drawable.blog20, "By Shelley Pallis. Country boy Dai Miyamoto (voiced by Yuki Tamada) moves to the big city of Tokyo in the hope of making it big as a jazz saxophonist."))
        return articles
        }
}


