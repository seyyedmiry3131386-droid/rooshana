package io.sentry.android.fragment;

import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 io.sentry.android.fragment.FragmentLifecycleState, still in use, count: 1, list:
  (r0v0 io.sentry.android.fragment.FragmentLifecycleState) from 0x0099: INVOKE (r11v5 java.util.HashSet), (r0v0 io.sentry.android.fragment.FragmentLifecycleState) VIRTUAL call: java.util.HashSet.add(java.lang.Object):boolean A[MD:(E):boolean (c)] (LINE:154)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class FragmentLifecycleState {
    ATTACHED("attached"),
    SAVE_INSTANCE_STATE("save instance state"),
    CREATED("created"),
    VIEW_CREATED("view created"),
    STARTED("started"),
    RESUMED("resumed"),
    PAUSED("paused"),
    STOPPED("stopped"),
    VIEW_DESTROYED("view destroyed"),
    DESTROYED("destroyed"),
    DETACHED("detached");

    private static final Set<FragmentLifecycleState> states;
    private final String breadcrumbName;
    public static final a Companion = new a();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(new FragmentLifecycleState("attached"));
        hashSet.add(new FragmentLifecycleState("save instance state"));
        hashSet.add(new FragmentLifecycleState("created"));
        hashSet.add(new FragmentLifecycleState("view created"));
        hashSet.add(new FragmentLifecycleState("started"));
        hashSet.add(new FragmentLifecycleState("resumed"));
        hashSet.add(new FragmentLifecycleState("paused"));
        hashSet.add(new FragmentLifecycleState("stopped"));
        hashSet.add(new FragmentLifecycleState("view destroyed"));
        hashSet.add(new FragmentLifecycleState("destroyed"));
        hashSet.add(new FragmentLifecycleState("detached"));
        states = hashSet;
    }

    private FragmentLifecycleState(String str) {
        this.breadcrumbName = str;
    }

    public static FragmentLifecycleState valueOf(String str) {
        return (FragmentLifecycleState) Enum.valueOf(FragmentLifecycleState.class, str);
    }

    public static FragmentLifecycleState[] values() {
        return (FragmentLifecycleState[]) $VALUES.clone();
    }

    public final String getBreadcrumbName$sentry_android_fragment_release() {
        return this.breadcrumbName;
    }
}
