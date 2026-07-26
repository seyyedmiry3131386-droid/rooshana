package ir.mservices.market.movie.data.webapi;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieAdDto implements Serializable {

    @vo7("appInfo")
    private final AppInfoDto appInfo;

    @vo7("content")
    private final ContentDto content;

    @vo7("endCard")
    private final EndCardDto endCard;

    @vo7(CommonDataKt.AD_LINK)
    private final LinkDto link;

    @vo7("player")
    private final PlayerDto player;

    @vo7("sequence")
    private final Integer sequence;

    @vo7("target")
    private final String target;

    public MovieAdDto(Integer num, String str, ContentDto contentDto, EndCardDto endCardDto, AppInfoDto appInfoDto, PlayerDto playerDto, LinkDto linkDto) {
        this.sequence = num;
        this.target = str;
        this.content = contentDto;
        this.endCard = endCardDto;
        this.appInfo = appInfoDto;
        this.player = playerDto;
        this.link = linkDto;
    }

    public final AppInfoDto getAppInfo() {
        return this.appInfo;
    }

    public final ContentDto getContent() {
        return this.content;
    }

    public final EndCardDto getEndCard() {
        return this.endCard;
    }

    public final LinkDto getLink() {
        return this.link;
    }

    public final PlayerDto getPlayer() {
        return this.player;
    }

    public final Integer getSequence() {
        return this.sequence;
    }

    public final String getTarget() {
        return this.target;
    }
}
