package org.eclipsetrader.ui.internal.views;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipsetrader.ui.internal.views.messages"; //$NON-NLS-1$
	public static String ColumnsPage_Columns;
	public static String ColumnsPage_SelectColumnsToDisplay;
	public static String ColumnsProperties_Columns;
	public static String ColumnsViewer_AvailableColumns;
	public static String ColumnsViewer_ShownColumns;
	public static String GeneralProperties_General;
	public static String GeneralProperties_SameNamePrompt;
	public static String GeneralProperties_TargetRepository;
	public static String GeneralProperties_WatchListMustHaveName;
	public static String GeneralProperties_WatchListName;
	public static String Level2View_Ask;
	public static String Level2View_Bid;
	public static String Level2View_Change;
	public static String Level2View_High;
	public static String Level2View_LastPrice;
	public static String Level2View_LevelII;
	public static String Level2View_Low;
	public static String Level2View_MM;
	public static String Level2View_Number;
	public static String Level2View_Qty;
	public static String Level2View_SelectDataSource;
	public static String Level2View_Symbol;
	public static String Level2View_Time;
	public static String Level2View_Volume;
	public static String NamePage_CreateNewWatchList;
	public static String NamePage_SameNamePrompt;
	public static String NamePage_TargetRepository;
	public static String NamePage_WatchList;
	public static String NamePage_WatchListName;
	public static String SecurityProperties_Securities;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}