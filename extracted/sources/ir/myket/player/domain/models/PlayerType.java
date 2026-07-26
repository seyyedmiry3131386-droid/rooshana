package ir.myket.player.domain.models;

import ir.mservices.market.movie.data.webapi.CommonDataKt;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PlayerType {
    public static final PlayerType a;
    public static final PlayerType b;
    public static final /* synthetic */ PlayerType[] c;

    static {
        PlayerType playerType = new PlayerType(CommonDataKt.PLAYER_TYPE_MAIN, 0);
        a = playerType;
        PlayerType playerType2 = new PlayerType(CommonDataKt.PLAYER_TYPE_LIVE, 1);
        b = playerType2;
        PlayerType[] playerTypeArr = {playerType, playerType2, new PlayerType(CommonDataKt.PLAYER_TYPE_AD, 2)};
        c = playerTypeArr;
        a.a(playerTypeArr);
    }

    public static PlayerType valueOf(String str) {
        return (PlayerType) Enum.valueOf(PlayerType.class, str);
    }

    public static PlayerType[] values() {
        return (PlayerType[]) c.clone();
    }
}
