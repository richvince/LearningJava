/*
Copyright 2010 kiddy
*/
package other;

public enum MoreAction implements IDescription{
	TURN_LEFT {
		public String getDescription() {
			return "向左转";
		}
	},	//记得这里的枚举值分割使用
	TURN_RIGHT {
		public String getDescription() {
			return "向右转";
		}
	},
	SHOOT {
		public String getDescription() {
			return "射击";
		}
	};
	
}
