package ir.mservices.market.version2.ui.recycler.holder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MultiSelectViewHolder$ViewHolderType {
    public static final MultiSelectViewHolder$ViewHolderType a;
    public static final MultiSelectViewHolder$ViewHolderType b;
    public static final /* synthetic */ MultiSelectViewHolder$ViewHolderType[] c;

    static {
        MultiSelectViewHolder$ViewHolderType multiSelectViewHolder$ViewHolderType = new MultiSelectViewHolder$ViewHolderType("MOVIE", 0);
        a = multiSelectViewHolder$ViewHolderType;
        MultiSelectViewHolder$ViewHolderType multiSelectViewHolder$ViewHolderType2 = new MultiSelectViewHolder$ViewHolderType("APP", 1);
        b = multiSelectViewHolder$ViewHolderType2;
        MultiSelectViewHolder$ViewHolderType[] multiSelectViewHolder$ViewHolderTypeArr = {multiSelectViewHolder$ViewHolderType, multiSelectViewHolder$ViewHolderType2};
        c = multiSelectViewHolder$ViewHolderTypeArr;
        kotlin.enums.a.a(multiSelectViewHolder$ViewHolderTypeArr);
    }

    public static MultiSelectViewHolder$ViewHolderType valueOf(String str) {
        return (MultiSelectViewHolder$ViewHolderType) Enum.valueOf(MultiSelectViewHolder$ViewHolderType.class, str);
    }

    public static MultiSelectViewHolder$ViewHolderType[] values() {
        return (MultiSelectViewHolder$ViewHolderType[]) c.clone();
    }
}
