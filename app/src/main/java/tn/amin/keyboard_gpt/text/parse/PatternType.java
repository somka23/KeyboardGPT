package tn.amin.keyboard_gpt.text.parse;

public enum PatternType {
    Settings("Settings", 0, "\\*#settings#\\*$", false),
    CommandAI("Default AI command", 1, "\\$([^$]*)\\$$", true),
    ;

    public final String title;
    public final int groupCount;
    public final String defaultPattern;
    public final boolean editable;

    PatternType(String title, int groupCount, String defaultPattern, boolean editable) {
        this.title = title;
        this.groupCount = groupCount;
        this.defaultPattern = defaultPattern;
        this.editable = editable;
    }
}
