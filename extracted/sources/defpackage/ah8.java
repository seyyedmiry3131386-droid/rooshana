package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ah8 {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final ImmutableSet e = ImmutableSet.m(2, "auto", "none");
    public static final ImmutableSet f = ImmutableSet.m(3, "dot", "sesame", "circle");
    public static final ImmutableSet g = ImmutableSet.m(2, "filled", "open");
    public static final ImmutableSet h = ImmutableSet.m(3, "after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    public ah8(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
