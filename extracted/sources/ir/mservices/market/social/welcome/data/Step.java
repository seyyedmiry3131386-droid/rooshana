package ir.mservices.market.social.welcome.data;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Step {
    public static final Step a;
    public static final /* synthetic */ Step[] b;
    public static final /* synthetic */ r22 c;

    static {
        Step step = new Step("USER_NAME", 0);
        a = step;
        Step[] stepArr = {step, new Step("PICTURE", 1), new Step("BIRTHDAY", 2), new Step("GENDER", 3)};
        b = stepArr;
        c = a.a(stepArr);
    }

    public static Step valueOf(String str) {
        return (Step) Enum.valueOf(Step.class, str);
    }

    public static Step[] values() {
        return (Step[]) b.clone();
    }
}
