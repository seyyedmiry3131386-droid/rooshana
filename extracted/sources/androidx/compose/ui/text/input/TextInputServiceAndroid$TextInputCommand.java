package androidx.compose.ui.text.input;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class TextInputServiceAndroid$TextInputCommand {
    public static final TextInputServiceAndroid$TextInputCommand a;
    public static final TextInputServiceAndroid$TextInputCommand b;
    public static final TextInputServiceAndroid$TextInputCommand c;
    public static final TextInputServiceAndroid$TextInputCommand d;
    public static final /* synthetic */ TextInputServiceAndroid$TextInputCommand[] e;

    static {
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand = new TextInputServiceAndroid$TextInputCommand("StartInput", 0);
        a = textInputServiceAndroid$TextInputCommand;
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand2 = new TextInputServiceAndroid$TextInputCommand("StopInput", 1);
        b = textInputServiceAndroid$TextInputCommand2;
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand3 = new TextInputServiceAndroid$TextInputCommand("ShowKeyboard", 2);
        c = textInputServiceAndroid$TextInputCommand3;
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand4 = new TextInputServiceAndroid$TextInputCommand("HideKeyboard", 3);
        d = textInputServiceAndroid$TextInputCommand4;
        TextInputServiceAndroid$TextInputCommand[] textInputServiceAndroid$TextInputCommandArr = {textInputServiceAndroid$TextInputCommand, textInputServiceAndroid$TextInputCommand2, textInputServiceAndroid$TextInputCommand3, textInputServiceAndroid$TextInputCommand4};
        e = textInputServiceAndroid$TextInputCommandArr;
        kotlin.enums.a.a(textInputServiceAndroid$TextInputCommandArr);
    }

    public static TextInputServiceAndroid$TextInputCommand valueOf(String str) {
        return (TextInputServiceAndroid$TextInputCommand) Enum.valueOf(TextInputServiceAndroid$TextInputCommand.class, str);
    }

    public static TextInputServiceAndroid$TextInputCommand[] values() {
        return (TextInputServiceAndroid$TextInputCommand[]) e.clone();
    }
}
