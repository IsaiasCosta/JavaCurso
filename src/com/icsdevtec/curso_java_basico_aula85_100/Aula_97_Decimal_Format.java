package com.icsdevtec.curso_java_basico_aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula_97_Decimal_Format {

	public static void main(String[] args) {

		String padrao = "###.###,##";
		DecimalFormat df = new DecimalFormat();

		// df.applyPattern(123456879.15654);
		System.out.println(df.format(123456879.165));

		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));

		dfs.setDecimalSeparator('.');
		dfs.setGroupingSeparator(',');

		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);

		System.out.println(df.format(123456879.176));

		String padrao3 = "###,###.##";
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(4);
		System.out.println(df.format(123456879.176));
		

		String padrao4 = "###,###,#0.00";
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(0.1));
		
	}

}
