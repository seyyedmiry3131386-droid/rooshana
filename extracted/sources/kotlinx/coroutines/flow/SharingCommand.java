package kotlinx.coroutines.flow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SharingCommand {
    public static final SharingCommand a;
    public static final SharingCommand b;
    public static final SharingCommand c;
    public static final /* synthetic */ SharingCommand[] d;

    static {
        SharingCommand sharingCommand = new SharingCommand("START", 0);
        a = sharingCommand;
        SharingCommand sharingCommand2 = new SharingCommand("STOP", 1);
        b = sharingCommand2;
        SharingCommand sharingCommand3 = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = sharingCommand3;
        SharingCommand[] sharingCommandArr = {sharingCommand, sharingCommand2, sharingCommand3};
        d = sharingCommandArr;
        kotlin.enums.a.a(sharingCommandArr);
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) d.clone();
    }
}
