package info.motodell.trasem.classes;

import java.util.ArrayList;

import info.motodell.trasem.R;
import info.motodell.trasem.classes.imagevo.ImageMsl;

public class Utilities {

    //imageMslAlphabetList = list of images of the alphabet in mexican sign language

    public static ArrayList<ImageMsl> imageMslAlphabetList = null;

    public static void getAlphabetList() {
        imageMslAlphabetList = new ArrayList<ImageMsl>();

        imageMslAlphabetList.add(new ImageMsl(1, R.drawable.lsm_a, "a", "A", "Con la mano cerrada, se muestran las uñas y se estira el dedo pulgar hacia un lado. La palma mira al frente."));
        imageMslAlphabetList.add(new ImageMsl(2, R.drawable.lsm_b, "b", "B", "Los dedos índice, medio, anular y meñique se estiran bien unidos y el pulgar se dobla hacia la palma, la cual mira al frente."));
        imageMslAlphabetList.add(new ImageMsl(3, R.drawable.lsm_c, "c", "C", "Los dedos índice, medio, anular y meñique se mantienen bien unidos y en posición cóncava; el pulgar también se pone en esa posición. La palma mira a un lado."));
        imageMslAlphabetList.add(new ImageMsl(4, R.drawable.lsm_d, "d", "D", "Los dedos medio, anular, meñique y pulgar se unen por las puntas y el dedo índice se estira. La palma mira al frente."));
        imageMslAlphabetList.add(new ImageMsl(5, R.drawable.lsm_e, "e", "E", "Se doblan los dedos completamente, y se muestran las uñas. La palma mira al frente."));
        imageMslAlphabetList.add(new ImageMsl(6, R.drawable.lsm_f, "f", "F", "Con la mano abierta y los dedos bien unidos, se dobla el índice hasta que su parte lateral toque la yema del pulgar. La palma mira a un lado."));
        imageMslAlphabetList.add(new ImageMsl(7, R.drawable.lsm_g, "g", "G", "Se cierra la mano y los dedos índice y pulgar se estiran. La palma mira hacia usted."));
        imageMslAlphabetList.add(new ImageMsl(8, R.drawable.lsm_h, "h", "H", "Con la mano cerrada y los dedos índice y medio bien estirados y unidos, se extiende el dedo pulgar señalando hacia arriba. La palma mira hacia usted."));
        imageMslAlphabetList.add(new ImageMsl(9, R.drawable.lsm_i, "i", "I", "Con la mano cerrada, el dedo meñique se estira señalando hacia arriba. La palma se pone de lado."));
        imageMslAlphabetList.add(new ImageMsl(10, R.drawable.lsm_j, "j", "J", "Con la mano cerrada, el dedo meñique bien estirado señalando hacia arriba y la palma a un lado dibuja una j en el aire."));
        imageMslAlphabetList.add(new ImageMsl(11, R.drawable.lsm_k, "k", "K", "Se cierra la mano con los dedos índice, medio y pulgar estirados. La yema del pulgar se pone entre el índice y el medio. Se mueve la muñeca hacia arriba."));
        imageMslAlphabetList.add(new ImageMsl(12, R.drawable.lsm_l, "l", "L", "Con la mano cerrada y los dedos índice y pulgar estirados, se forma una l. La palma mira al frente."));
        imageMslAlphabetList.add(new ImageMsl(12, R.drawable.lsm_m, "m", "M", "Con la mano cerrada, se ponen los dedos índice, medio y anular sobre el pulgar."));
        imageMslAlphabetList.add(new ImageMsl(14, R.drawable.lsm_n, "n", "N", "Con la mano cerrada, se ponen los dedos índice y medio sobre el pulgar."));
        imageMslAlphabetList.add(new ImageMsl(15, R.drawable.lsm_enie, "ñ", "Ñ", "Con la mano cerrada, se ponen los dedos índice y medio sobre el pulgar. Se mueve la muñeca a los lados."));
        imageMslAlphabetList.add(new ImageMsl(16, R.drawable.lsm_o, "o", "O", "Con la mano se forma una letra o. Todos los dedos se tocan por las puntas."));
        imageMslAlphabetList.add(new ImageMsl(17, R.drawable.lsm_p, "p", "P", "Con la mano cerrada y los dedos índice, medio y pulgar estirados, se pone la yema del pulgar entre el índice y el medio."));
        imageMslAlphabetList.add(new ImageMsl(18, R.drawable.lsm_q, "q", "Q", "Con la mano cerrada, se ponen los dedos índice y pulgar en posición de garra. La palma mira hacia abajo, y se mueve la muñeca hacia los lados."));
        imageMslAlphabetList.add(new ImageMsl(19, R.drawable.lsm_r, "r", "R", "Con la mano cerrada, se estiran y entrelazan los dedos índice y medio. La palma mira al frente."));
        imageMslAlphabetList.add(new ImageMsl(20, R.drawable.lsm_s, "s", "S", "Con la mano cerrada, se pone el pulgar sobre los otros dedos. La palma mira al frente."));
        imageMslAlphabetList.add(new ImageMsl(21, R.drawable.lsm_t, "t", "T", "Con la mano cerrada, el pulgar se pone entre el índice y el medio. La palma mira al frente."));
        imageMslAlphabetList.add(new ImageMsl(22, R.drawable.lsm_u, "u", "U", "Con la mano cerrada, se estiran los dedos índice y medio unidos. La palma mira al frente."));
        imageMslAlphabetList.add(new ImageMsl(23, R.drawable.lsm_v, "v", "V", "Con la mano cerrada, se estiran los dedos índice y medio separados. La palma mira al frente."));
        imageMslAlphabetList.add(new ImageMsl(24, R.drawable.lsm_w, "w", "W", "Con la mano cerrada, se estiran los dedos índice, medio y anular separados. La palma mira al frente."));
        imageMslAlphabetList.add(new ImageMsl(25, R.drawable.lsm_x, "x", "X", "Con la mano cerrada, el índice y el pulgar en posición de garra y la palma dirigida a un lado, se realiza un movimiento al frente y de regreso."));
        imageMslAlphabetList.add(new ImageMsl(26, R.drawable.lsm_y, "y", "Y", "Con la mano cerrada, se estira el meñiquey el pulgar. La palma mira hacia usted."));
        imageMslAlphabetList.add(new ImageMsl(27, R.drawable.lsm_z, "z", "Z", "Con la mano cerrada, el dedo índice estirado y la palma al frente, se dibuja una letra z en el aire."));
    }
}
