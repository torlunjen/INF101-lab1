# Git og GitLab

I INF101 bruker du som student **Git** til

- klone (laste ned) oppgavene fra en Git-server til din egen datamaskin,
- committe (lagre) så ofte som mulig mens du jobber med en oppgave,
- pulle (laste ned de siste endringene fra serveren til maskinen din) og
- pushe (laste opp de siste endringene fra maskinen til serveren).
- ++

Eclipse er i stand til å gjøre mange av Git-operasjonene inne i programmet, men vi anbefaler at du først lærer deg å bruke Git ved hjelp av terminalen for å få en bedre forståelse av hvordan det fungerer. Hvis ikke kan alt virke "magisk", og når noe går galt (merk **når**) vet man ikke hva man skal gjøre.

Applikasjonen vi bruker til å håndtere alle Git-repositoriene heter **GitLab**, og kjører på en UiB-server på URLen Retting.ii.uib.no. (Eksempler på andre slike servere er github.com, gitlab.com, bitbucket.com, etc.)

## 1. Tilgang til GitLab

Alle studentene som er oppmeldt til INF101 og har logget inn på Mitt UiB skal automatisk ha fått en konto på GitLab-instansen på Retting.ii.uib.no. Merk at når vi snakker om GitLab i INF101 så er det alltid på denne URLen. Brukernavnet ditt er det samme som student-epostadressen din, f.eks. bruce.wayne@student.uib.no. Dersom du er usikker på hva som er din studentepostadresse finner du dette oppe til høyre inne på din Webmail. For å sette et passord velger du "Forgot your password?" på framsiden -> skriver inn eposten -> åpner eposten fra UiB -> Reset Password -> Lag et passord.

Bruk gjerne et minutt eller to til å gjøre deg kjent på nettsiden etter du har logget inn, ettersom du kommer til å måtte navigere deg rundt mange ganger. Søkevinduet oppe til høyre er nyttig når du vet hvilket repositorie du vil gå til.

## 2. Legg inn opplysninger i Git

Bruk de to terminalkommandoene

```
git config --global user.name "FIRST_NAME LAST_NAME"
git config --global user.email "MY_NAME@example.com"
```

til å lagre navn og epost (bruk student-eposten din her) i Git-konfigurasjonen på maskinen din. Hvis du ikke gjør dette kommer Git til å klage når du prøver å committe (lagre) endringer, for Git er nemlig opptatt av _hvem_ som gjorde endringene slik at de potensielt senere kan krediteres (eller skyldes på...).

## 3. Clone

På GitLab kommer du til å få tilgang til en del **repositorier** (prosjekt-mapper). Når du skal kjøre eller utvikle videre på et repositorie må du først hente det ned på din egen maskin ved hjelp av Git, i Git-verdenen kalles dette å **klone** repositoriet. Navnet kommer av at du oppretter en kopi av repositoriet på maskinen din.

Noen av repositoriene kommer til å være offentlige slik at alle har tilgang til de, og noen kommer til å være private som f.eks. ukesoppgavene og innleveringene. Dine medstudenter har med andre ord ingen tilgang til dine oppgaver. For å kunne klone et _privat_ prosjekt kommer Git til å spørre deg om brukernavn og passord. Dersom du etterhvert blir lei dette kan du bruke dette svaret på Stack Overflow til å lagre passordet permanent: https://stackoverflow.com/a/5343146. Da lar du Git bruke et eksternt program til lagre passordene, f.eks. _osxkeychain_ som er preinstallert på mac.

Når du skal klone et repositorie går du inn på framsiden til repositorie på GitLab. Merk at du kan ha tilgang til to repositorier med samme navn, et offentlig (under f.eks inf101.v20.oppgaver) som du ikke har redigeringstilgang til og et privat (fra og med neste laboppgave) - i så fall ønsker du å klone det _private_ repositoriet. Trykk på den blå Clone-knappen oppe til høyre og kopier URLen for _HTTPS_ (i skrivende stund er SSH stengt). Gå så til terminalen din og naviger deg til den mappen du vil klone repositoriet til. Klon med kommandoen

```
git clone <URL her>
```

f.eks

```
git clone https://retting.ii.uib.no/inf101/inf101.v20/inf101.v20.lab1.git
```

Git skal så laste ned repositoriet til den mappen du er i.

## 4. Commit

_Kommer ..._

## 5. Push

_Kommer ..._

## 6. Pull

_Kommer ..._

## 7. Flere resurser

Sel om GIT er et verktøy du kan bruke og teste på lokal maskin er det ikke alltid like lett å følge utfallet av komandoene. Dersom du ønsker å lære GIT er det mange gode videoer og
ressurser online. Under er en liste som kan være til hjelp:

- [LearnGitBranching](https://learngitbranching.js.org/) er et online "spill" hvor du kan prøve ut og øve på GIT kommandoene
