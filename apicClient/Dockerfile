FROM node:8.7-alpine

# Create app directory
WORKDIR /usr/src/app

# Install app dependencies
# A wildcard is used to ensure both package.json AND package-lock.json are copied
# where available (npm@5+)

# COPY package*.json ./
RUN npm config -g set strict-ssl false && \
#    npm config set proxy http://proxy_address:port && \
#    npm config set https-proxy http://proxy_address:port && \
    npm install -g apiconnect && \
    apic -v

# If you are building your code for production
# RUN npm install --only=production

# Bundle app source
#COPY . .

EXPOSE 8080
CMD [ "npm", "start" ]