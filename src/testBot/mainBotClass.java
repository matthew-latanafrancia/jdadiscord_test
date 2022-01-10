package testBot;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
//import net.dv8tion.jda.api.entities.Game;

import javax.security.auth.login.LoginException;

public class mainBotClass {
    public static JDA jda;

    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("OTI5ODUzNTI1NDA2NjY2NzYy.YdtXlA.OQ6zaNC-PZj6-9CvVcLa37wgWEo");
        builder.setActivity(Activity.playing("i love pikachu so so much"));
        builder.setStatus(OnlineStatus.ONLINE);
        builder.addEventListeners(new Commands());
        //builder.setChunkingFilter(ChunkingFilter.ALL);  //lets the bot see all
        //builder.setMemberCachePolicy(MemberCachePolicy.ALL); //lets the bot see all members in the server
        //builder.enableIntents(GatewayIntent.GUILD_MEMBERS); //gives bot perms to access all the members
        builder.build();
    }
}
