package testBot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.GenericMessageEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class Commands extends ListenerAdapter {
    public String prefix = "!";
    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase(prefix + "shinyhunterdestroyer")){
            //example line to show how to send a message in reply to a command
            //event.getChannel().sendMessage("This is a pretty sick test isn't it.").queue();

            EmbedBuilder embed = new EmbedBuilder();
            embed.setTitle("ShinyHunterDestroyer", "https://www.youtube.com/shinyhunterdestroyer");
            embed.setDescription("Sometimes he uploads most of the time he doesn't");
            embed.setColor(Color.CYAN);
            embed.addField("Current Anime", "Digimon: Ghost Game \n Digimon Adventures 02 \n Pokemon (2019)", false);
            embed.addField("Embed Field 2", "This is the content of Field 2", false);
            embed.setFooter("Bot created by Dez", event.getGuild().getOwner().getUser().getAvatarUrl());
            event.getChannel().sendMessage(embed.build()).queue();
            embed.clear();
        }

    }
}
