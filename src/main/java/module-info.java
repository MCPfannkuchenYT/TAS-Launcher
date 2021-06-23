module TASLauncher {
	requires transitive javafx.graphics;
	requires transitive javafx.controls;
	requires transitive javafx.fxml;
	requires transitive AccountAPI;
	requires transitive javafx.base;
	opens de.pfannekuchen.taslauncher to javafx.fxml;
	exports de.pfannekuchen.taslauncher;
	exports de.pfannekuchen.taslauncher.loader;
	exports de.pfannekuchen.taslauncher.util;
	exports de.pfannekuchen.taslauncher.main;
}