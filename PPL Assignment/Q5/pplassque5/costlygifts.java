

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
		/**
		 * constructor intialized when new object of essential gift is made 
		 * @param ess (to accept price of essentialgifts)
		 * @param value (to acccept value)
		 * @param type (to accept type of gift 1)
		 */
	public	costlygifts(int ess, int value, int type)
		{
				price1 = ess;
				essentialgifts_value = value;
				gifttype =type;
		}
		/**
		 * constuctor initialized when new object of luxury gift is made
		 * @param lux (to accept the price of luxury gifts)
		 * @param rating (to accept it's rating)
		 * @param value (to accept value)
		 * @param diff (to accept difficulty)
		 */
	public	costlygifts(int lux, int rating, int value, int diff)
		{
				price1 = lux;
				luxurygifts_value = value;
				luxurygifts_rating = rating;
				luxurygifts_difficulty = diff;
				gifttype = 2;
		}
		/**
		 * contructor initialized when new object of utility gift is made
		 * @param price (to accept the price of utility gifts )
		 * @param utyvalue (to accept utility value)
		 * @param value (to accept its value)
		 * @param clss (to accept class
		 * @param type  (to accept type 3)
		 */
	public	costlygifts(int price, int utyvalue, int value, int clss, int type)
		{
			 price1 = price;
			 utilitygifts_utyvalue = utyvalue;
			 utilitygifts_value = value;
			  utilitygifts_class = clss;
			 gifttype = type;

		}

}
