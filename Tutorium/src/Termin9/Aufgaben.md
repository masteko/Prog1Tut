# Aufgaben

## Aufgabe 1

Schreiben Sie eine Methode namens istZweistellig, die �berpr�ft, ob die als Parameter �bergebene
integer-Zahl zwei Stellen besitzt. Handelt es sich um eine zweistellige Zahl, so liefert istZweistellig
den booleschen Wert true zur�ck, ansonsten false.

*Hinweis: Bedenken Sie, dass die �bergebene integer-Zahl auch negativ sein kann.*

___

## Aufgabe 2

Gegeben sei folgende Klasse:
```Java
public class Schachbrett {
  //markiert alle bedrohten Felder
  boolean[][] brett = new boolean[8][8];
}
```

Erg�nzen Sie in der Klasse zwei Methoden:
* Die erste Methode setzeTurm soll eine x- und eine y-Position entgegennehmen. Von dieser
Position aus sollen alle durch einen Turm bedrohten Felder auf dem brett durch true
markiert werden, d.h. alle Felder in der gleichen Zeile und gleichen Spalte, sowie das Feld
auf der �bergebenen Position.
Hinweise: In der Methode setzeTurm soll noch keine Ausgabe erfolgen! Gehen Sie davon
aus, dass f�r x und y nur Werte zwischen 0 und 7 �bergeben werden, d.h., abweichend vom
�blichen Koordinatensystem bei Schach benutzen wir wie beim 2-dimensionalen Feld f�r
jede Dimension die Indizes 0 ..7!
* Die zweite Methode gibBedrohteFelderAus soll das komplette Schachbrett (siehe Grafik)
inkl. bedrohter Felder ausgeben. F�r jedes false auf dem brett soll ein o ausgegeben werden,
f�r jedes true ein x.


**Beispiel:** 
Die Aufrufe
```Java
setzeTurm(3, 5);
gibBedrohteFelderAus();
```
sollen folgende Ausgabe liefern.


| O | O | O | O | O | X | O | O |
|---|---|---|---|---|---|---|---|
| O | O | O | O | O | X | O | O |
| O | O | O | O | O | X | O | O |
| X | X | X | X | X | X | X | X |
| O | O | O | O | O | X | O | O |
| O | O | O | O | O | X | O | O |
| O | O | O | O | O | X | O | O |

___

## Aufgabe 3

Schreiben Sie eine Methode `int[] addiere(int[] a, int[] b)`, die eine Addition zweier Zahlen mit
gleicher Ziffernanzahl ausf�hrt. Eine Zahl wird hierbei durch ein int-Feld repr�sentiert, dessen
Feldelemente jeweils eine Ziffer (0-9) dieser Zahl sind. Die h�chstwertige Stelle einer Zahl steht im
Feldelement 0.
Der Methode werden die zwei zu summierenden Parameter a und b �bergeben. Das Ergebnis der
Methode ist die Summe der beiden Zahlen in der beschriebenen Array-Darstellung.
Ber�cksichtigen Sie dabei, dass bei der Addition zweier Zahlen ein �bertrag auftreten kann.
Sie k�nnen davon ausgehen, dass die Methode nur gleich lange und g�ltige Zahlen �bergeben
bekommt. Ihr zur�ckgegebenes Ergebnisfeld darf keine f�hrenden Nullen enthalten.

```Java
int[] zahl1 = {3, 4, 2};
int[] zahl2 = {6, 2, 9};
addiere(zahl1, zahl2) // {9, 7, 1} (342 + 629 = 971)
```

___