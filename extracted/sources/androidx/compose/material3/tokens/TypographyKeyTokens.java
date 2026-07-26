package androidx.compose.material3.tokens;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TypographyKeyTokens {
    public static final TypographyKeyTokens a;
    public static final /* synthetic */ TypographyKeyTokens[] b;

    static {
        TypographyKeyTokens typographyKeyTokens = new TypographyKeyTokens("BodyLarge", 0);
        TypographyKeyTokens typographyKeyTokens2 = new TypographyKeyTokens("BodyMedium", 1);
        TypographyKeyTokens typographyKeyTokens3 = new TypographyKeyTokens("BodySmall", 2);
        a = typographyKeyTokens3;
        TypographyKeyTokens[] typographyKeyTokensArr = {typographyKeyTokens, typographyKeyTokens2, typographyKeyTokens3, new TypographyKeyTokens("DisplayLarge", 3), new TypographyKeyTokens("DisplayMedium", 4), new TypographyKeyTokens("DisplaySmall", 5), new TypographyKeyTokens("HeadlineLarge", 6), new TypographyKeyTokens("HeadlineMedium", 7), new TypographyKeyTokens("HeadlineSmall", 8), new TypographyKeyTokens("LabelLarge", 9), new TypographyKeyTokens("LabelMedium", 10), new TypographyKeyTokens("LabelSmall", 11), new TypographyKeyTokens("TitleLarge", 12), new TypographyKeyTokens("TitleMedium", 13), new TypographyKeyTokens("TitleSmall", 14), new TypographyKeyTokens("BodyLargeEmphasized", 15), new TypographyKeyTokens("BodyMediumEmphasized", 16), new TypographyKeyTokens("BodySmallEmphasized", 17), new TypographyKeyTokens("DisplayLargeEmphasized", 18), new TypographyKeyTokens("DisplayMediumEmphasized", 19), new TypographyKeyTokens("DisplaySmallEmphasized", 20), new TypographyKeyTokens("HeadlineLargeEmphasized", 21), new TypographyKeyTokens("HeadlineMediumEmphasized", 22), new TypographyKeyTokens("HeadlineSmallEmphasized", 23), new TypographyKeyTokens("LabelLargeEmphasized", 24), new TypographyKeyTokens("LabelMediumEmphasized", 25), new TypographyKeyTokens("LabelSmallEmphasized", 26), new TypographyKeyTokens("TitleLargeEmphasized", 27), new TypographyKeyTokens("TitleMediumEmphasized", 28), new TypographyKeyTokens("TitleSmallEmphasized", 29)};
        b = typographyKeyTokensArr;
        a.a(typographyKeyTokensArr);
    }

    public static TypographyKeyTokens valueOf(String str) {
        return (TypographyKeyTokens) Enum.valueOf(TypographyKeyTokens.class, str);
    }

    public static TypographyKeyTokens[] values() {
        return (TypographyKeyTokens[]) b.clone();
    }
}
