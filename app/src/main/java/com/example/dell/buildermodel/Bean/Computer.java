package com.example.dell.buildermodel.Bean;

public class Computer {
    private String name;
    private String color;

    public static class Builder {
        Computer computer;

        public Builder() {
            computer = new Computer();
        }

        public Builder setName(String name) {
            computer.setName(name);
            return this;
        }

        public Builder setColor(String color) {
            computer.setColor(color);
            return this;
        }

        public Computer build() {
            return computer;
        }

    }

    public Computer() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
