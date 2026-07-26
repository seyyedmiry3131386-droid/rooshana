package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteMediator$InitializeAction {
    public static final RemoteMediator$InitializeAction a;
    public static final /* synthetic */ RemoteMediator$InitializeAction[] b;

    static {
        RemoteMediator$InitializeAction remoteMediator$InitializeAction = new RemoteMediator$InitializeAction("LAUNCH_INITIAL_REFRESH", 0);
        a = remoteMediator$InitializeAction;
        RemoteMediator$InitializeAction[] remoteMediator$InitializeActionArr = {remoteMediator$InitializeAction, new RemoteMediator$InitializeAction("SKIP_INITIAL_REFRESH", 1)};
        b = remoteMediator$InitializeActionArr;
        kotlin.enums.a.a(remoteMediator$InitializeActionArr);
    }

    public static RemoteMediator$InitializeAction valueOf(String str) {
        return (RemoteMediator$InitializeAction) Enum.valueOf(RemoteMediator$InitializeAction.class, str);
    }

    public static RemoteMediator$InitializeAction[] values() {
        return (RemoteMediator$InitializeAction[]) b.clone();
    }
}
