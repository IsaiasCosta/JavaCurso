package com.icsdevtec.curso_java_basico_aula58;

public class AutoBoxing_AutoUnboxing {

	public static void main(String[] args) {

		// autoboxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 1000l;
		Float num11 = 3.5f;
		Double num12 = 3.55;
		Boolean flag2 = true;
		Character b = 'b';

		// auto unboxing

		int num13 = num9;

		// auto boxing em espressôes
		num9++;
		System.out.println(num9);

		// auto unboxing num9 -> autoboxing num13/num9 resultado da expressão para num14
		Integer num14 = num13 / num9;

		// mau uso

		Double a, d, c;

		a = 10.0;
		d = 12.2;
		c = 4.7;
		Double media = (a + d + c) / 3;
		System.out.println(media);

	}

}
