package com.example.filmova_databaze;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Film> films;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        films = new ArrayList<>();
        films.add(new Film("https://img.csfd.cz/files/images/film/posters/159/391/159391481_7c80d9.jpg?h180", "Amélie des Abbesses", "Comedy, Drama, Romantic", "85 %",
                "Amélie žije v pařížské čtvrti Montmartre, která je světem sama pro sebe. Je číšnicí v místním bistru, nakupuje u místního zelináře, zdraví sousedy jako na malém městě. V jejím životě se nikdy neudálo nic zvláštního, až na matčinu kuriózní smrt, nad níž Améliin tatínek stále truchlí. Amélie by asi zůstala smířená se svým osamělým údělem, kdyby jednoho dne neobjevila ve svém bytě ukrytý poklad v podobě staré krabice s památkami na dětství někdejšího nájemníka. Nejenže se Amélie rozhodne po letech doručit krabici jejímu majiteli, ale dospěje současně k poznání, že může pomáhat zlepšit a napravovat okolní svět. Když pak jednoho dne objeví člověka sbírajícího u nádražních fotoautomatů zahozené podobenky cizích lidí, Amélie se zamiluje. Trvá to ale ještě nějaký čas, než se seznámí s Ninem a než mu dovolí rozšifrovat její tajemné zprávy."));
        films.add(new Film("https://img.csfd.cz/files/images/film/posters/000/337/337575_32e932.jpg?h180", "Limitless", "Mysterious, Sci-Fi, Thiller", "81 %",
                "Eddie Morra (Bradley Cooper) je zlenivělý spisovatel, kterému se začíná hroutit svět. Chtějí ho vyhodit z práce a rozchod s přítelkyní Lindy (Abbie Cornish) ho jen utvrdí v přesvědčení, že jeho život je v troskách a budoucnost nemůže přinést nic než další zklamání. To se ale změní ve chvíli, kdy Eddieho navštíví jeho starý přítel z dětství, Vernon (Johnny Whitworth). Nabídne mu pilulky NZT - utajovanou drogu, která umožňuje využívat mozek na 100 % a dodává člověku extrémní sebevědomí. Eddie se nechává zlákat neodolatelnými účinky NZT a naprosto droze propadne. Najednou je schopen využívat informace s ohromnou efektivitou. Vše, co kdy viděl, slyšel a přečetl, zvládá zpracovat a zužitkovat. Neustálá stimulace drogou ho katapultuje mezi elitu finančního sektoru. Jeho nadlidský výkon a úspěch přitáhne pozornost finančního magnáta Carla Van Loona (Robert De Niro), který v drogou posíleném Eddiem vidí příležitost, jak vydělat miliardy. Zázračná droga má ale nebezpečné vedlejší účinky a Eddie se ocitá v ohrožení života. Musí se skrývat, nájemní vrazi jsou však stále blíž. Podaří se mu uniknout, nebo doplatí na zrádnou představu, že ho droga učiní všemocným?"));
        films.add(new Film("https://img.csfd.cz/files/images/film/posters/000/501/501780_540187.png?h180", "Intouchables", "Comedy, Drama, Biographical", "91 %",
                "Ochrnutý a bohatý aristokrat Philippe si za svého nového opatrovníka vybere Drisse, živelného mladíka z předměstí, kterého právě propustili z vězení. Jinými slovy - najde si na tuto práci tu nejméně vhodnou osobu. Podaří se jim však propojit nemožné: Vivaldiho a populární hudbu, serióznost a žoviální vtípky, luxusní obleky a tepláky. Bláznivým, zábavným, silným, neočekávaným a hlavně „nedotknutelným“, přesně takovým se stane jejich přátelství… Komedie s dramatickou zápletkou o tom, že ani od krku po prsty u nohou nepohyblivý člověk odkázaný na pomoc druhých, nemusí ztratit smysl života. A o tom, že i nejméně pravděpodobné spojení melancholického multimilionáře a extrovertního recidivisty může humorně zapůsobit na diváka a může se z něj stát kasovní trhák."));
        films.add(new Film("https://img.csfd.cz/files/images/film/posters/158/336/158336635_61bc7c.jpg?h180", "Pulp Fiction", "Crimi, Drama", "91 %",
                "Nejkultovnější z kultovních filmů 90. let je autorskou Biblí Quentina Tarantina, který v tomto opusu definoval základní prvky své režisérské poetiky a vytvořil dílo rozněcující náročné kritiky na festivalu v Cannes, levicové a pravicové intelektuály i zedníky dopřávající si po těžké šichtě trochu oddychu. Pulp Fiction je multižánrovým opusem, který přetéká fetišistickými detaily a popkulturními odkazy a zároveň dokonale funguje jako svrchovaně napínavý film rozvržený do inovativní příběhové struktury. Chcete vidět homosexuální znásilnění sbližující dva nepřátele na život a na smrt?"));
        films.add(new Film("https://img.csfd.cz/files/images/film/posters/159/449/159449892_0f24ad.jpg?h180", "The Butterfly Effect", "Sci-Fi, Mysterious, Thiller", "87 %",
                "Evan Treborn (Ashton Kutcher) se vydává pomocí schopností zděděných po otci a díky svým zápiskům z dětství na riskantní cestu do minulosti, aby ji změnil, napravil své chyby a setkal se s láskou svého života. Nebezpečný experiment se mu však vymkne z rukou..."));
        films.add(new Film("https://img.csfd.cz/files/images/film/posters/162/398/162398465_dc9ff3.jpg?h180", "Star Wars: Episode V - The Empire Strikes Back", "Sci-Fi, Fantasy, Action", "89 %",
                "Nastaly temné časy pro Povstání. I přes to, že \"Hvězda smrti\" byla zničena, imperiální jednotky vyhnaly Rebely z jejich tajné základny a pronásledovaly je po celé Galaxii. Aby se vyhnula střetu s hrůzostrašnou Imperiální flotilou, skupina svobodných pilotů vedená Lukem Skywalkerem vybudovala novou tajnou základnu na opuštěné ledové planetě Hothu. Imperátorův pobočník Darth Vader, posedlý hledáním mladého Skywalkera, však vyslal tisíce sond do všech koutů vesmíru..."));
        films.add(new Film("https://img.csfd.cz/files/images/film/posters/160/620/160620903_69696f.jpg?h180", "Inception", "Thiller, Mysterious, Action, Sci-Fi, Adventurous", "89 %","Dom Cobb (Leonardo DiCaprio) je zkušený zloděj, absolutní špička v nebezpečném umění extrakce: krádeže cenných tajemství z hloubi podvědomí během snění, kdy je mysl nejzranitelnější. Cobbova vzácná schopnost z něj učinila vyhledávaného hráče v zákeřném světě korporátní špionáže, ale také z něj udělala uprchlíka a stála ho všechno, co kdy miloval. Teď dostane Cobb šanci na vykoupení. Jedna poslední akce mu může vrátit normální život, ale jen pokud se mu podaří provést nemožné – počátek. Místo dokonalé krádeže musí Cobb a jeho tým specialistů zvrátit běh věcí. Jejich úkolem není myšlenku ukrást, ale vnuknout ji. Pokud uspějí, půjde o dokonalý zločin. Ale sebepečlivější plánování a odborná znalost je nemůže připravit na nebezpečného nepřítele, který nejspíš předvídá každý jejich krok. Nepřítel, kterého mohl čekat jen Cobb. Uznávaný režisér Christopher Nolan natočil mezinárodně obsazený sci-fi akční snímek „Počátek“, který vás zavede nejen na různá místa na světě ale také do intimního a nekonečného světa snů."));
        films.add(new Film("https://img.csfd.cz/files/images/film/posters/000/008/8959_6de990.jpg?h180", "The Matrix", "Action, Sci-Fi", "90 %",
                "Uvěříte neuvěřitelnému! Představte si, že vaše realita je jen iluzí a vaše nejtemnější noční můry jsou ve skutečnosti pravdivé. Představte si, že vaše současnost je vlastně minulostí a to budoucí se děje právě teď. Když si to dokážete představit, potom se budete cítit jako hrdina snímku Matrix Thomas Anderson (Keanu Reeves). A věřte, že to nebude příjemný pocit. Anderson je normální mladý muž, který se jen snaží přežít v každodenním shonu moderního velkoměsta. A má všechny předpoklady aby se mu to povedlo: dobré přátele, milující rodinu a perspektivní práci v multinárodní počítačové společnosti Meta Cortech. Jednoho dne, nebo lépe řečeno noci, se však do jeho spokojeného mozku zakousne strašlivá noční můra. Zdá se mu, že byl proti své vůli vložen v podobě dat do počítače a všechno to, co až dosud považoval za svůj osud, je jen vírem dat okolo několika tištěných spojů. Má pocit, že mu byla jeho mysl ukradena a uvězněna v obřím Matrix počítače budoucnosti. Začíná vážně pochybovat o své každodenní skutečnosti. Byl skutečně vhozen do stroje? Kdo je za to zodpovědný? Je tam s ním zavřeno i těch několik stovek lidí, které zná? Nebo jsou to jen projekce, které mají udržet zdání reality? A pak je tu otázka nejdůležitější: pokud je to všechno pravda, co se stane, až jeho věznitelé přijdou na to, že ji zná?"));
        films.add(new Film("https://img.csfd.cz/files/images/film/posters/158/600/158600806_7b6c15.jpg?h180", "The Lord of the Rings: The Fellowship of the Ring", "Fantasy, Adventurous, Action", "90 %",
                "Hlavním hrdinou je hobit Frodo Pytlík, který se ve své vlastní domovině zvané Středozemě dostal do samotného centra bitvy mytických proporcí. Bude muset během svého putování prokázat, že moc přátelství a individuální odvahy dokáže úspěšně čelit i těm nejničivějším silám temnoty. Frodova dobrodružství odstartuje dar jeho příbuzného Bilba. Od něj získá magický prsten, který Froda postaví do soboje se silami zla reprezentovanými krutovládcem Sauronem. Ten touží za každou cenu získat prsten, protože je pro něj zdrojem neomezené moci, jedině s jeho pomocí se mu může podařit zotročit lid Středozemě a stát se jeho neomezeným pánem. Ve snaze čelit Sauronovým temným plánům, se musí Frodo spojit se několika dalšími bytostmi. Vytvoří s nimi takzvané Společenstvo složené z jeho přátel, čaroděje, elfa, trpaslíka a dalších pomocníků, se kterými se vydá na cestu na jejímž konci doufají, že se jim podaří prsten jednou provždy zničit. Jejich cesta však prokáže, že nejenom magické prsteny, ale také sounáležitost všech živých bytostí mohou dokázat netušené věci. Musí však čelit nejen nebezpečím, která na ně číhají na územích ovládaných Sauronem, ale i rozkladné moci samotného prstenu."));
        films.add(new Film("https://img.csfd.cz/files/images/film/posters/000/004/4110_632c7c.jpg?h180", "Pelíšky", "Comedy, Drama", "91 %","Děj je zasazen do konce šedesátých let - podzim 67 až léto 68 s krátkým epilogem přesahujícím do let sedmdesátých. Pražská vilová čtvrť Hanspaulka, jemná poetika a humorná nadsázka jsou charakteristické pro mozaikové vyprávění paralelních životních osudů tří generací mužů a žen ve zvláštním období našich dějin v roce 1968."));
        //slo by doplnovat pomoci ArrayListu - aby se nemuselo psat

        OurAdapter adapter = new OurAdapter(this, films);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this,films.get(position).title,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("data", films.get(position));
                //intent put extra akceptuje jen urcite typy promenych - pouzijeme parcelable - je na jednoduche objekty,
                // musim upravit u class Films - implements parcelable a pak Alt+Enter dokud to neimplementuje vsechny metody, ktere budu potrebovat
                // parcelable umi objekty zpracovat a poslat je jako string - ale lepsi je poslat si id a vytahnout to z databaze
                MainActivity.this.startActivity(intent);
            }
        });

    }
}
