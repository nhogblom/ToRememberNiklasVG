# ToRemember 📝

### 📖 Beskrivning
ToRemember är ett program som hjälper dig att hålla koll på viktiga händelser och uppgifter i vardagen. Med ToRemember kan användare enkelt skapa minneslistor (memory lists) och knyta specifika anteckningar till dessa listor för att få en bra överblick över vad som behöver göras.

### 💻 Användning
I dagsläget är applikationen helt terminalbaserad. Du interagerar med programmet genom att följa de utskrivna instruktionerna i terminalfönstret.

Funktioner som stöds:
* Skapa och ta bort minneslistor.
* Lägga till och ta bort anteckningar.
* Sortera dina anteckningar efter prioritet.
* Visa alla anteckningar filtrerat på en specifik kategori.

**Kom igång (via IntelliJ IDEA):**
För att starta programmet lokalt, följ dessa steg i din IDE:
1. Leta upp serverklassen (`SingleServerListener.java`) i projektvyn.
2. Högerklicka på filen och välj `Run 'SingleServerListener.main()'`.
3. Leta därefter upp klientklassen (`ToRemember.java`) i projektvyn.
4. Högerklicka på filen och välj `Run 'ToRemember.main()'`.

### 🏗️ Designmönster och Arkitektur
Programmet är strukturerat efter **MVC-mönstret** (Model-View-Controller). Detta val gjordes för att separera logiken från vyn, vilket gör det enkelt att i framtiden bygga på med andra typer av gränssnitt (t.ex. Java Swing eller en webbaserad vy) utan att behöva skriva om grundlogiken.

Vidare används **Singleton-mönstret** för att säkerställa att klienten alltid kommunicerar med rätt serverinstans, samt att servern enbart upprättar och använder en enda gemensam anslutning mot MySQL-databasen.
