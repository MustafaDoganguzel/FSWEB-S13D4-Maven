package org.example;


    public enum Weapon {
        SWORD(73, 1.2), AXE(90, 1), KNIFE(50, 1.4);

        private final int damage;
        private final double attackSpeed;
        Weapon(int damage, double attackSpeed) {
            this.damage = damage;
            this.attackSpeed = attackSpeed;
        }

        ;



        public int getDamage() {
            return damage;

        }

        public double getAttackSpeed() {
            return attackSpeed;
        }

    }

