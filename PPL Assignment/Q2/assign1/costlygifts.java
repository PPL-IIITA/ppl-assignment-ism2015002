package assign1;

public class costlygifts {
		int essentialgifts_price;
		int essentialgifts_value;
		int price1;
		int luxurygifts_value;
		int luxurygifts_rating;
		int luxurygifts_difficulty;
		int utilitygifts_price;
		int utilitygifts_class;
		int utilitygifts_utyvalue;
		int utilitygifts_value;
		int gifttype;
		costlygifts(int ess, int value, int type)
		{
				price1 = ess;
				essentialgifts_value = value;
				gifttype =type;
		}
		costlygifts(int lux, int rating, int value, int diff)
		{
				price1 = lux;
				luxurygifts_value = value;
				luxurygifts_rating = rating;
				luxurygifts_difficulty = diff;
				gifttype = 2;
		}
		costlygifts(int price, int utyvalue, int value, int clss, int type)
		{
			 price1 = price;
			 utilitygifts_utyvalue = utyvalue;
			 utilitygifts_value = value;
			  utilitygifts_class = clss;
			 gifttype = type;

		}

}
