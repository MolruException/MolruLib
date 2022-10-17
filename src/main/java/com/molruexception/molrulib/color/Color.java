package com.molruexception.molrulib.color;

import com.google.common.collect.Lists;
import net.md_5.bungee.api.ChatColor;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public class Color {

    @NotNull
    public static List<String> colored(@NotNull Collection<String> strs) {
        List<String> contents = Lists.newArrayListWithCapacity(strs.size());
        for (String str : strs) {
            final String colored = ChatColor.translateAlternateColorCodes('&', str);
            contents.add(colored);
        }
        return contents;
    }

    @NotNull
    public static String[] colored(@NotNull String... strs) {
        int size = strs.length;
        String[] contents = new String[size];
        for (int index = 0; index < size; index++) {
            contents[index] = ChatColor.translateAlternateColorCodes('&', strs[index]);
        }
        return contents;
    }

    @NotNull
    public static String colored(@NotNull String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }

    @NotNull
    public static List<String> uncolored(@NotNull Collection<String> strs) {
        List<String> contents = Lists.newArrayListWithCapacity(strs.size());
        for (String str : strs) {
            final String uncolored = ChatColor.stripColor(str);
            contents.add(uncolored);
        }
        return contents;
    }

    @NotNull
    public static String[] uncolored(@NotNull String... strs) {
        int size = strs.length;
        String[] contents = new String[size];
        for (int index = 0; index < size; index++) {
            contents[index] = ChatColor.stripColor(strs[index]);
        }
        return contents;
    }

    @NotNull
    public static String uncolored(@NotNull String str) {
        return ChatColor.stripColor(str);
    }

}
